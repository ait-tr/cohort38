// const img = document.getElementById('dogImage');

// находим картинку, которой будем добавлять адрес
const img = document.querySelector("#dogImage")

// fetch('https://dog.ceo/api/breeds/image/random')
//   .then(res => res.json())
//   .then(({ message, status }) =>     {
//     img.src = message
//     img.alt = status
//   })





async function fetchDog() {
  const res = await fetch("https://dog.ceo/api/breeds/image/random")
  const { message } = await res.json()
  img.src = message
}

fetchDog()
