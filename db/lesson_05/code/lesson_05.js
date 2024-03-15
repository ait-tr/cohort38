use("lesson_05");

// db.employee.insertMany([
//   { name: "Ruslan", salary: 3500, costs: 1750 },
//   { name: "Ekaterina", salary: 2600, costs: 3000 },
// ]);

//условие - $expr
// db.employee.find({ $expr: { $lt: ["$salary", "$costs"] } });

//UPDATE -----------------------

// db.animals.insertMany([
//   { kind: "Cat", weight: 5, name: "Barsik", predatory: true },
//   { kind: "Dog", weight: 10, name: "Gretta", predatory: true },
//   { kind: "Penguin", weight: 20, name: "Kovalsky", predatory: true },
//   { kind: "Panda", weight: 110, name: "Po", predatory: false },
//   { kind: "Horse", weight: 500, name: "Spirit", predatory: true },
//   { kind: "Horse", weight: 1000, name: "Marta", predatory: true },
// ]);

// SET: обновление с помощью оператора $set
// обновление нескольких записей
// db.animals.updateMany({ kind: "Horse" }, { $set: { predatory: false } });
// db.animals.updateMany({}, { $set: { predatory: false } });

// обновление одной записи (документа)
// db.animals.updateOne({ kind: "Horse" }, { $set: { weight: 800 } });

// INC: обновление с помощью оператора $inc
// db.animals.updateMany({},{$inc: {weight: 2}});
// db.animals.updateMany({},{$inc: {weight: -3}});

// добавляем новое свойство food для животных, которые являются хищниками (predatory: true)
// db.animals.updateMany(
//   { predatory: true },
//   { $set: { food: ["meet", "fish"] } }
// );

//RENAME - переименовывает название свойств $rename
// db.animals.updateMany({}, { $rename: { weight: "kg" } });

//PUSH - добавляет элемент в массив - $push
// db.animals.updateMany({ kind: "Penguin" }, { $push: { food: "mollusk" } });

//UNSET - убрать свойство
// db.animals.updateOne({ kind: "Panda" }, { $unset: { predatory: "" } });

//DELETE -----------------------------------------
//удаление документа с id - 65f482f2dd28188df2a13347
// db.animals.deleteOne({ _id: ObjectId("65f482f2dd28188df2a13347") });

//добавим дополнительных животных
// db.animals.insertMany([
//     { kind: "Dino", weight: 1500, name: "Barsik", predatory: true },
//     { kind: "Dino", weight: 30000, name: "TRex", predatory: true },
// ]);

//удалаяем всех динозавров
// db.animals.deleteMany({ kind: "Dino" });

//AGGREGATION---------------------------------------
// Основные стадии (этапы, stages) обработки - операторы
// $match 		фильтрация
// $sort 		сортировка (-1 по убыванию, 1 по возрастанию)
// $project 		проекция
// $limit 		лимитирование
// $skip 		пропустить (документы)
// $group 		группировка
// $lookup 		объединение коллекций
// $addFields 	добавить поля
// $sample 		получить произвольные документы
// $count 		возвращает ко-во документов

//Оператор $match - вывод всех хищных животных
// db.animals.aggregate([
//   {$match: {
//     predatory: true
//   }}
// ]);

//вывод всех хищных животных и сортируем их по убыванию
// db.animals.aggregate([
//   {
//     $match: {
//       predatory: true,
//     },
//   },
//   {
//     $sort: {
//       kg: -1,
//     },
//   },
// ]);

//вывести самое тяжелое хищное животное
// db.animals.aggregate([
//   { $match: { predatory: true } },
//   { $sort: { kg: -1 } },
//   { $limit: 1 },
// ]);

//вывести второе по тяжести хищное животное
// db.animals.aggregate([
//   { $match: { predatory: true } },
//   { $sort: { kg: -1 } },
//   { $skip: 1 },
//   { $limit: 1 },
// ]);

//получить имя животного, которое весит 109
// db.animals.aggregate([
//   { $match: { kg: 109 } },
//   { $project: { name: 1, _id: 0 } },
// ]);

//получить все свойства, кроме имени животного, которое весит 109
// db.animals.aggregate([
//   { $match: { kg: 109 } },
//   { $project: { name: 0 } },
// ]);

//получить количество хищных животных
// db.animals.aggregate([
//   { $match: { predatory: true } },
//   { $count: "numbers_of_predatory" },
// ]);

//получить случайное животное весом больше 9kg
// db.animals.aggregate([
//   { $match: { kg: { $gt: 9 } } },
//   { $sample: { size: 1 } },
// ]);

//метод для подсчёта количества документов - countDocuments
// db.animals.countDocuments();
// db.animals.countDocuments({ kind: "Cat" });

//LOOKUP
// db.post.insertOne({
//   _id: ObjectId("65f482f2dd28188df2a13346"),
//   likes: 10,
//   text: "Hi, I am glad to be on LinkedIn",
// });

// db.comments.insertOne({
//   email: "us@mail.com",
//   message: "Hi, Tom",
//   post_id: ObjectId("65f482f2dd28188df2a13346"),
// });

// db.comments.insertOne({
//   email: "us1@mail.com",
//   message: "Hello",
//   post_id: ObjectId("65f482f2dd28188df2a13346"),
// });

// db.comments.insertOne({
//   email: "user2@mail.com",
//   message: "You`re the best",
//   post_id: ObjectId("65f482f2dd28188df2a13346"),
// });

//оператор $lookup
// db.comments.aggregate([
//   {
//     $lookup: {
//       from: "post", //куда будем подсматривать
//       localField: "post_id", //как называется поле в коллекции локальной (comments)
//       foreignField: "_id", ///как называется поле во внешней коллекции (post)
//       as: 'post_info',
//     },
//   },
// ]);

//GROUP - $group
// db.kids.insertMany([
//   { name: "John", age: 5, gender: "boy" },
//   { name: "Anna", age: 6, gender: "girl" },
//   { name: "Leyla", age: 4, gender: "girl" },
//   { name: "Frieda", age: 3, gender: "boy" },
//   { name: "Bob", age: 5, gender: "boy" },
//  ]);

// db.kids.aggregate([
//   {
//     $group: { _id: "$gender", averageAge: { $avg: "$age" } },
//   },
// ]);

//сгруппировать детей по полу и вывести максимальный возраст в каждой группе
db.kids.aggregate([{ $group: { _id: "$gender", maxAge: { $max: "$age" } } }]);
