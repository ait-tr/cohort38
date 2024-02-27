// Создайте метод getStudent, который возвращает promise - объекта (студент с именем "Anri" и возрастом 32), c задержкой 4 секунды.
// Вызовите этот метод - сохраните в переменную.
// Раскройте promise при помощи then, выведите имя студента.

function getStudent() {
  return new Promise((resolve, reject)=> {
    setTimeout(()=> {
      resolve({name:'Anri', age: 32})
    }, 4000)
  })
}

// чтобы получить доступ к асинхронным данным мы используем .then()

getStudent().then(data => console.log(data))


function getDriverLicense(success, failure) {
  if (Math.random() > 0.4) {
    success("успех!")
  } else {
    failure("упс, неудача..")
  }
}

function success(res) {
  console.log(`Успешно завершено с результатом ${res}`);
}

function failure(error) {
  console.log(`Завершено с ошибкой ${error}`);
}


getDriverLicense(success, failure)


// console.log(Math.random());
// console.log(Math.random() * 100);

console.log(Math.floor(Math.random() * 10 + 1));

// Math.random() выдает случайное число от 0 до 1 с плавающей точкой
// Math.floor() округляет число с плавающей точкой до целого
// числа после точки можно 'достать' перемножив полученное случайное число на 10, 100 итд
// + 1 мы добавляем чтобы 0 не попадал в наши случайные значения
