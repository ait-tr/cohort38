function getUser() {
  setTimeout(()=> {
    return "User!"
  }, 3000)
}

let user = getUser()

// console.log(user);

// мы не сможем получить результат асинхронного действия синхронными методами


function getUserPromise() {
  return new Promise(function(resolve, reject) {
    setTimeout(()=> {
      resolve("User!")
    }, 3000)
  })
}

const myPromise = getUserPromise()

// console.log(myPromise);

// Promise, 'обещанные' данные, может находиться в трех состояниях

// <pending> - ожидание данных
// <resolve> - успешное получение данных
// <reject> - данные в случае ошибки

// обрабатываем асинхронный promise асинхронно!
// через цепочку из then() и catch()

function iWantToKnowEverything(answer) {
  return new Promise((resolve, reject) => {
    if (String(answer) === "42") {
      setTimeout(()=> {
        console.log('success!');
        // если условие верное то, отработает resolve
        resolve('Now you know everything!')
      }, 2000)
    } else {
      setTimeout(()=> {
        console.log('error!');
        // ! если условие НЕ верное то, reject
        reject(new Error(`Wrong answer! ${answer} is wrong :(`))
      }, 2000)
    }
  })
}

// console.log('если обрабатывать синхронно: ', iWantToKnowEverything(42));

// iWantToKnowEverything(44)
//   //позитивный исход обрабатываем через then()
//   .then((obj)=> console.log('Данные is then: ', obj))
//    //ошибку через catch()
//   .catch((err) => console.log('Данные из catch:', err))


// комментарии ниже цветные, из-за расширения better comments

// ! const sum1 = (a,b) => a+b
// ? const sum2 = (a,b) => {return a+b}
// todo console.log(sum1(4,4));
// * console.log(sum2(22,44));


// создайте функцию, которая возвращает promise
// это будет функция closestPlanetToEarth()

// правильным ответом будет 'Mercury'
// (подумайте про то что кто-то может написать с маленькой буквы или заглавными)

// выведите в случае успеха объект с данными о планете
// {name: ..., size: ...}

// в случае ошибки выводите '<имя планеты> is wrong planet!


function closestPlanetToEarth(planet) {
  return new Promise((resolve, reject) => {
    if (planet.toUpperCase() === 'MERCURY' ) {
      setTimeout(()=> {
        resolve({name: 'Mercury', size: '3,032 miles'})
      }, 1000)
    } else {
      setTimeout(()=> {
        reject(new Error(`${planet} is wrong planet!`))
      }, 1000)
    }
  })
}

// closestPlanetToEarth('mercury')
//   .then((res)=> console.log(res))
//   .catch((err)=> new Error(err))


closestPlanetToEarth('venice')
  .then((res)=> console.log(res))
  .catch((err) => console.log(err))

console.log(closestPlanetToEarth('mercury'));


