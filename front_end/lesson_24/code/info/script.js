const burger = document.querySelector("#burger")
const panel = document.querySelector("#panel")

burger.addEventListener("click", (e) => {
  panel.classList.toggle("panelShow")
})

panel.addEventListener("click", () => {
  panel.classList.toggle("panelShow")
})
