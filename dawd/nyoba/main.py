import time
import sys

# Daftar lirik
lyrics = [
    "And there was something about you that now I can't remember",
    "It's the same damn thing that made my heart surrender",
    "And I'll miss you on a train.",
    "I'll miss you in the morning.",
    "I never know what to think about."
]

delays = [0.01, 1.0, 0.94, 1.0, 0.01]

for i in range(len(lyrics)):
    line = lyrics[i]
    delay = delays[i]
  
    for char in line:
        sys.stdout.write(char)
        sys.stdout.flush()
        time.sleep(0.079)
    print()
    time.sleep(delay)
