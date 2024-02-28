const filmTitle = document.getElementById("title")
const filmLink = document.getElementById("link")
const filmOscar = document.getElementById("oscar")
const filmDescription = document.getElementById("description")
const filmPoster = document.getElementById("poster")
const btnFetch = document.getElementById("btnFetch")
const filmCard = document.getElementById("filmCard")
const circle = document.getElementById("circle")
const square = document.getElementById("square")

// https://dmitrii-kuvaldin.github.io/lotr-api/data.json


btnFetch.addEventListener("click", () => {
    //мы добавили новый класс по нажатию на кнопку!
    //на ней все стили
    filmCard.classList.add("card")
    filmCard.classList.add("super")
  async function getData() {
    const res = await fetch(
        "https://dmitrii-kuvaldin.github.io/lotr-api/data.json",
        )
        const data = await res.json()
        const { title, year, wiki, hasOscar, poster, description } = data
        // добавление данных к текстовому элементу через textContent
        filmTitle.textContent = `${title}, ${year} year`
        filmPoster.src = poster
        filmDescription.textContent = description
        filmOscar.textContent = hasOscar ? "Won 11 oscars ✨" : "Now awards :("
        filmLink.textContent = "Ссылка на wiki"
        filmLink.href = wiki
    }
    getData()
})

// всплытие - это поведение браузера по умолчанию, когда события на контейнере
// срабатывают от событий вложенных детей
// чтобы этого не произошло мы должны запретить событию 'всплывать' через метод stopPropagation()

square.addEventListener("click", () => {
  square.classList.add("violet")
})
circle.addEventListener("click", (e) => {
    e.stopPropagation()
  circle.classList.add("orange")
})
