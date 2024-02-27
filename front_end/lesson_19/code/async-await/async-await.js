// готовим promise данные
function getUser(){
  return new Promise ((resolve, reject)=> {
    setTimeout(()=> {
      resolve('Tom Hanks')
    }, 2000   )
  })
}



// реализация получения данных на then()

getUser().then(res => {
  console.log(`My name is ${res} from then()`);
})

// реализация на async / await


async function getUserAsync(){
  const res = await getUser()
  console.log(`My name is ${res} from async`);
}

getUserAsync()
