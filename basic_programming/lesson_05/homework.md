## Task 01

```
Как расписано на примере b1, расписать с помощью коментариев все логические операции. проверить с ответом
boolean b1 =  ((5 > 7) ^ (true ^ !true) || ((true ^ !false) ^ !true)) && !((5 > 7) && (7 < 9)) || (((2 < 3) || (1 > 0)) && (24 >= 19));
//              false        true             false           false
//                      true                          false

boolean b2 =  ((5 >= 7) && !(true ^ !true) ^ !(!(true || !false) ^ !true)) || !((5 < 7) && !(7 < 9)) || ((!(2 < 3) ^ (1 > 0)) && !(24 >= 19));
boolean b3 =  ((5 > 7) ^ !(true ^ true) && (!!(true ^ !false) || !true)) || (!(5 > 7) && !(7 > 9)) && ((!(2 < 3) ^ (1 < 0)) || (24 >= 19));

boolean b4 =  !!((5 > 7) ^ (!true ^ !true) && ((true || !false) ^ !true)) || ((5 < 7) && (7 < 9)) && (((2 < 3) || (1 > 0)) ^ (24 >= 19));
boolean b5 =  ((5 > 7) ^ (true ^ !false) || ((false ^ false) ^ true)) || (!(5 > 7) && !(7 < 9)) || (((2 < 3) || (1 > 0)) && (24 >= 19));
```