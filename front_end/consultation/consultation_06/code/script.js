// 1. Создать квадрат с размерами 150х150 px. При клике на квадрат перекрашивать его в красный цвет

const square = document.querySelector('.square');

square.addEventListener('click', () => square.style.backgroundColor = 'red');


// 2. Дан массив с объектами. Для каждого продукта создать карточку (div) с двумя параграфами - title и price.
// К каждой карточке применить стили: border, padding, width.
// Если стоимость товара больше 60, то цвет карточки светло-зеленый. Если меньше или равно 60, то светло-желтый
// При клике на карточку менять ее ширину и высоту на 300px

const productsData = [
  {
    id: 1,
    product: 'Apple',
    price: 100
  },
  {
    id: 2,
    product: 'Orange',
    price: 50
  },
  {
    id: 1,
    product: 'Kiwi',
    price: 70
  }
]

const productsContainer = document.querySelector('.products_container');

productsData.forEach(({ product, price }) => {
  const cardElem = document.createElement('div');
  const titleElem = document.createElement('p');
  const priceElem = document.createElement('p');

  titleElem.innerText = `Title: ${product}`;
  priceElem.innerText = price + '$';

  cardElem.style.backgroundColor = price > 60 ? 'lightgreen' : 'lightyellow';

  cardElem.addEventListener('click', () => {
    cardElem.style.width = '300px';
    cardElem.style.height = '300px';
  });

  cardElem.append(titleElem, priceElem);
  productsContainer.append(cardElem);
});


