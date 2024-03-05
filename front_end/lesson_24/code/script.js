// объявление переменных с элементами

const formItems = document.querySelector("#formItems")
const contentContainer = document.querySelector("#contentContainer")
const productList = document.querySelector("#productList")
const loader = document.querySelector("#loader")
const burger = document.querySelector("#burger")
const panel = document.querySelector("#panel")

// const user = { name: "Jack", role: "admin" }

// чтобы обратиться к хранилищу данных в браузере
// мы обращаемся к методу setItem у localStorage
// и передаем два параметра ключ и значение

localStorage.setItem("user", "Jack")

burger.addEventListener("click", (e) => {
  panel.classList.toggle("panelShow")
})

panel.addEventListener("click", (e) => {
  panel.classList.toggle("panelShow")
})

formItems.addEventListener("submit", (e) => {
  e.preventDefault()

  contentContainer.style.display = "none"
  productList.innerHTML = ""
  const amount = e.target["form-amount"].value

  formItems.reset()
  loader.style.display = "inline-block"

  fetch(`https://fakestoreapi.com/products?limit=${amount}`)
    .then((response) => response.json())
    .then((data) => {
      loader.style.display = "none"
      contentContainer.style.display = "block"
      data.map((el) => {
        //создаем div
        const containerItem = document.createElement("div")
        containerItem.classList.add("productsItem")
        // создаем текстовый элемент
        const newItem = document.createElement("span")
        newItem.textContent = el.title
        //создаем картинку
        const newImg = document.createElement("img")
        newImg.classList.add("img")
        newImg.src = el.image
        // создаем контейнер для картинки
        const newWrapper = document.createElement("div")
        newWrapper.classList.add("imgWrapper")
        // объединяем построенные элементы
        containerItem.append(newItem)
        newWrapper.append(newImg)
        containerItem.append(newWrapper)
        productList.append(containerItem)

        // const newImage = document.createElement("img")
        // newImage.src = el.image
        // newImage.width = "200"
        // productList.append(newImage)
      })
    })
})
