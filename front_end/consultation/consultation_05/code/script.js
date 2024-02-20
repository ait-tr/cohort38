// 1. Внутри div.users_container создать h2 с текстом "Users list"
// 2. Создать контейнер для карточек пользователей (cardsContainer). Внутри cardsContainer для каждого объекта массива usersData создать карточку (div) пользователя. В карточке должны быть указаны имя, фамилия, возраст и зарплата (p x 3)
// 3. Вывести только совершеннолетних пользователей
// 4. Всем пользователям увеличить зарплату на 500 и вывести только совершеннолетних пользователей, зарабатывающих больше 1400

const usersData = [
  {
    id: 1,
    firstname: 'Oleg',
    lastname: 'Petrov',
    age: 25,
    salary: 1000
  },
  {
    id: 2,
    firstname: 'Anna',
    lastname: 'Ivanova',
    age: 13,
    salary: 500
  },
  {
    id: 3,
    firstname: 'Anna',
    lastname: 'Sidorova',
    age: 43,
    salary: 1500
  },
  {
    id: 4,
    firstname: 'Pavel',
    lastname: 'Ushanov',
    age: 16,
    salary: 700
  },
  {
    id: 5,
    firstname: 'Nikita',
    lastname: 'Orlov',
    age: 87,
    salary: 890
  }
]

const usersContainer = document.querySelector('.users_container');

const cardsContainer = document.createElement('div');

const usersHeader = document.createElement('h2');
usersHeader.innerText = 'Users list:';
usersContainer.append(usersHeader, cardsContainer);

usersData
  .map(el => {
    el.salary += 500
    return el
  })
  .filter(el => el.age >= 18 && el.salary >= 1400)
  .forEach(el => {
    const cardElem = document.createElement('div');
    const nameElem = document.createElement('p');
    const ageElem = document.createElement('p');
    const salaryElem = document.createElement('p');

    nameElem.innerText = `Name: ${el.firstname} ${el.lastname}`;
    // nameElem.innerText = el.firstname + ' ' + el.lastname;

    ageElem.innerText = `Age: ${el.age}`;
    salaryElem.innerText = `Salary: ${el.salary}`;

    cardElem.append(nameElem, ageElem, salaryElem);
    cardsContainer.append(cardElem);
  });
