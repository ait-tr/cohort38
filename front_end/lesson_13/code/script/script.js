const rootNode = document.querySelector(".root");
const btnNode = document.querySelector(".btn");


// let counter = 0;
// btnNode.addEventListener("click", () => {
//     rootNode.innerText = ++counter;
// });

// при нажатии на кнопку counter должен увеличиваться
// на 1 и отображаться в rootNode

const users = [
    { name: 'Ivan', surname: 'Ivanov', gender: 'Male', textColor: "#222f3e" },
    { name: 'Maria', surname: 'Petrova', gender: 'Female', textColor: "#222f3e" },
    { name: 'Alexey', surname: 'Sidorov', gender: 'Male', textColor: "#222f3e" },
    { name: 'Ekaterina', surname: 'Smirnova', gender: 'Female', textColor: "#222f3e" }
];

const userNodesArray = users.map(({name, surname, gender, textColor}) => {
    const containerNode = document.createElement("div");
    const nameNode = document.createElement("p");
    const surnameNode = document.createElement("p");
    const btnNode = document.createElement("button");
    nameNode.innerText = name;
    surnameNode.innerText = surname;
    btnNode.innerText = "клик!";

    btnNode.addEventListener("click", () => {
        containerNode.classList.add("marked");
    })

    btnNode.addEventListener("dblclick", () => {
        containerNode.classList.remove("marked");
    })

    containerNode.append(nameNode, surnameNode, btnNode);
    containerNode.classList.add("user");
    containerNode.style.backgroundColor = gender === "Male"? "#3498db": "#f368e0";
    containerNode.style.color = textColor;
    return containerNode;
})

rootNode.append(...userNodesArray);

// добавить в формирование карточек кнопку 
// при нажатии на которую в консоль выводится 
// имя пользователя