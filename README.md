### Red_bridge

морда - http://80.78.243.239:3000/red-bridge

подключиться к серверу:\
ssh root@80.78.243.239\
<пароль>

## серверные команды

# front
start_front - запустить сервер\
stop_front - остановить сервер\
restart_front - перезапустить сервер

grep_front_PID - получить все PID запущенных vite (не должно быть больше одного, запустили случайно несколько vite - для каждого PID убиваем процесс kill -9 <PID>)

show_front_logs - открыть логи с выводом в режиме реального времени\
vi_show_front_loogs - открыть логи в vim (если нужно обработать большой размер логов)
