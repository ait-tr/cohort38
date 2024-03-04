// fetch запрос
// посылаем запрос за данными на сервер
// в том числе на сторонние API
// API - application programming interface
// в ответ получаем JSON - Javascript Object Notation

fetch("https://dog.ceo/api/breeds/image/random")
  // дожидаемся ответа от запроса

  .then((res) => res.json())

  // дожидаемся выполнения .json()
  .then((data) => console.log(data))
