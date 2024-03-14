use("school_db");

//создание коллекция user
// db.user.insertOne({name: 'Kate'});
// db.user.insertOne({name: 'Pavlik', age: 9});

//Вложенность
// db.user.insertOne({
//   name: "Andrej",
//   age: 12,
//   adress: { city: "Berlin", street: "Gutte str." },
// });

//Создание сразу нескольких пользователей
// db.user.insertMany([
//   { name: "Alexandra", age: 26 },
//   { name: "Denis", age: 35 },
// ]);

//Создание записи с массивом
// db.user.insertOne({
//   name: "Yuriy",
//   age: 17,
//   hobbys: ["running", "singing", "reading"],
// });

//Чтение(вывод) данных
// db.user.find();

//Вывод данных с лимитом
// db.user.find().limit(1);

// db.user.find().skip(2);

//Вывод данных с сортировкой a...z
// db.user.find().sort({name: 1});

//Вывод данных с сортировкой z...a
// db.user.find().sort({name: -1});

//Вывод данных с сортировкой по возрастанию.
// db.user.find().sort({age: 1});

//Вывод данных с сортировкой по убыванию.
// db.user.find().sort({age: -1});

//Вывод данных с сортировкой по двум значениям.
// db.user.insertOne({name: 'Pavlik', age: 8});
// db.user.find().sort({name: -1, age: 1});

//Поиск определённой записи
// db.user.find({ name: "Pavlik" }).limit(1);

//Операторы

//оператор больше - $gt
// db.user.find({ age: { $gt: 25 } });

//оператор меньше - $lt
// db.user.find({ age: { $lt: 25 } });

//оператор больше либо равно - $gte
// db.user.find({ age: { $gte: 26 } });

//оператор меньше либо равно - $lte
// db.user.find({ age: { $lte: 26 } });

//оператор равно - $eq
// db.user.find({name: {$eq: 'Andrej'}});

//оператор неравенства - $ne
// db.user.find({name: {$ne: 'Andrej'}});

//вывод определенных ключей и значений
// db.user.find({name: 'Pavlik'}, {name: 1, _id: 0});
// db.user.find({name: 'Pavlik'}, { _id: 0});

//db.user.find({}, { _id: 0});

//$in - соответствие одному из значений массива
// db.user.find({ name: { $in: ["Pavlik", "Andrej", "Yuriy"] } });

//$nin - несоответствие не одному из значений массива
// db.user.find({ name: { $nin: ["Pavlik", "Andrej", "Yuriy"] } });

//логические операторы
// оператор "И" - $and
// db.user.find({ $and: [{ name: "Pavlik" }, { age: { $ne: 9 } }] });
// db.user.find({ name: "Pavlik", age: { $ne: 9 } });

// оператор "ИЛИ" - $or
// db.user.find({ $or: [{ name: "Kate" }, { name: "Denis" }] });

// оператор "НЕ" - $not
// db.user.find({ age: { $not: { $gt: 8 } } });

//оператор $exists
// db.user.find({age: {$exists:true}});
// db.user.find({age: {$exists:false}});