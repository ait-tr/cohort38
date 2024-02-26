// setInterval будет воспроизводить одно и то же действие
// через заданный в миллисекундах промежуток времени
// чтобы потом можно было остановить интервал его обычно кладут в переменную

const interval = setInterval(()=> {
  console.log('Tick!');
}, 1000)


// чтобы остановить интервал мы используем метод cleanInterval
// в него аргументом мы передаем переменную с интервалом

setTimeout(()=> {
  console.log('now clean!');
  clearInterval(interval)
}, 7000)


function sum(a, b) {
  return a + b
}

console.log(sum(5, 10));
