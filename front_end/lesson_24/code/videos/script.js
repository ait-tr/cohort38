const user = document.querySelector("#user")
const burger = document.querySelector("#burger")
const panel = document.querySelector("#panel")

console.log(user)

if (localStorage.getItem("user") !== undefined) {
  console.log(localStorage.getItem("user"))
  user.textContent = localStorage.getItem("user")
}

burger.addEventListener("click", (e) => {
  panel.classList.toggle("panelShow")
})

panel.addEventListener("click", (e) => {
  panel.classList.toggle("panelShow")
})
