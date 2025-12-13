const http = require('http');

http.createServer((req, res) => {
    res.write("Bagaimana Kabarmu")
    res.end();
}).listen(3000)