const celsiusInput = document.getElementById('celsius');
const convertBtn = document.getElementById('convert');
const resultInput = document.getElementById('result');
const slider = document.getElementById('slider');
const copyBtn = document.getElementById('copyBtn');
const historyEl = document.getElementById('history');
const clearHistoryBtn = document.getElementById('clearHistory');
const precisionEl = document.getElementById('precision');


let precision = 1;
let history = [];
const maxHistory = 20;


function cToF(c){ return (c * 9/5) + 32; }
function formatNumber(n){ return Number.parseFloat(n).toFixed(precision); }


function updateResult(){
const c = parseFloat(celsiusInput.value);
if (isNaN(c)) { resultInput.value = ''; return; }
const f = cToF(c);
resultInput.value = formatNumber(f);
pushHistory(c, f);
}


function pushHistory(c,f){
const entry = `${new Date().toLocaleTimeString()} — ${formatNumber(c)} °C → ${formatNumber(f)} °F`;
history.unshift(entry);
if (history.length > maxHistory) history.pop();
renderHistory();
}


function renderHistory(){
historyEl.innerHTML = history.length ? history.map(h => `<p>${h}</p>`).join('') : '<p class="small">Belum ada riwayat.</p>';
}


convertBtn.addEventListener('click', updateResult);
slider.addEventListener('input', () => {
celsiusInput.value = slider.value;
updateResult();
});
celsiusInput.addEventListener('input', () => slider.value = celsiusInput.value);
copyBtn.addEventListener('click', async () => {
if (!resultInput.value) return;
await navigator.clipboard.writeText(resultInput.value + ' °F');
copyBtn.textContent = 'Tersalin!';
setTimeout(() => copyBtn.textContent = 'Salin', 1200);
});
clearHistoryBtn.addEventListener('click', () => { history = []; renderHistory(); });


slider.dispatchEvent(new Event('input'));
renderHistory();