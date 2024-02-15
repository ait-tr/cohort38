// Callback-функция - функция, переданная в другую функцию в качестве аргумента
// Функция высшего порядка - функция, принимающая другую функцию в качестве аргумента

const inst1 = num => num * 2; 
const inst2 = num => num / 2; 
const inst3 = num => num + 10; 


const mult = () => 2 * 2;

const mult1 = () => 2 * 3;
const mult2 = () => 2 * 4;
const mult3 = () => 2 * 5;

mult();

const mult4 = (num) => 2 * num;

mult4(2); // 4
mult4(100); // 200

// 1. Написать функцию, которая принимает 3 числа и возращает их сумму

const sum = (num1, num2, num3) => num1 + num2 + num3;

const number = 3;

// console.log(sum(1, 2, 3)); // 6
// console.log(sum(1, 2, number)) // 6
// console.log(sum(1, 2, mult4(10))) // 23


// 2. Написать функцию, которая принимает массив с числами и возращает новый массив, с теми же числами, умноженными на 2

const mult_nums = (arr) => {
  const new_arr = [];

  for(let i = 0; i < arr.length; i++){
    new_arr.push(arr[i] * 2)
  }

  return new_arr
}

// console.log(mult_nums([1, 2, 3])); // [2, 4, 6]
// console.log(mult_nums([4, 5, 6])); // [8, 10, 12]

const mult_nums2 = arr => arr.map(el => el * 2);

const a = mult_nums2([1, 2, 3]); // [2, 4, 6]
const b = mult_nums2([4, 5, 6]); // [8, 10, 12]

console.log(a);
console.log(b);

const mult_nums3 = arr => {
  const new_arr = [];
  arr.forEach(el => new_arr.push(el * 2))
  return new_arr
}

// 3. Написать функцию, которая принимает массив с числами и возращает новый массив, с теми же числами, деленными на 2

const divide_nums = (arr) => {
  const new_arr = [];

  for(let i = 0; i < arr.length; i++){
    new_arr.push(arr[i] / 2)
  }

  return new_arr
}

const divide_nums2 = (arr) => arr.map(el => el / 2);

// 4. Написать функцию, которая принимает массив с числами и возращает новый массив, с теми же числами, увеличенными на 10

const incr_nums = (arr) => {
  const new_arr = [];

  for(let i = 0; i < arr.length; i++){
    new_arr.push(arr[i] + 10)
  }

  return new_arr
}


// 5. Написать функцию, которая принимает массив с числами и инструкцию, что сделать с этими числами до того, как добавить их в новый массив

const change_nums = (arr, instruction) => {
  const new_arr = [];

  for(let i = 0; i < arr.length; i++){
    new_arr.push(instruction(arr[i]))
  }

  return new_arr
}

// console.log(change_nums([1, 2, 3], inst1)); // [2, 4, 6]
// console.log(change_nums([1, 2, 3], inst2)); // [0.5, 1, 1.5]
// console.log(change_nums([1, 2, 3], inst3)); // [11, 12, 13]


// ПРОСТЫЕ МЕТОДЫ МАССИВОВ

// push()
// pop()
// shift()
// unshift()


// СЛОЖНЫЕ МЕТОДЫ МАССИВОВ (принимают коллбэк)

// forEach(() => {}) - метод, который применяет переданную функцию к каждому элементу массива. Ничего не возращает (undefined)
// map(() => {}) - метод, который применяет переданную функцию к каждому элементу массива. Возвращает новый массив

