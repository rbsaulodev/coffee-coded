//Funções
function addNumber(x:number, y:number): number{
    return x + y
}

let resultado:number = addNumber(4, 6);
console.log(resultado);

function helloUser(user:string){
    return `Hello ${user}`;
}

let userSaulo = helloUser("Saulo Brilhante");
console.log(userSaulo);


//Funções multi tipos
function CallToPhone(phone: string | number): string | number{
    return phone;
}

let phone1 = CallToPhone("64 98875657");
let phone2 = CallToPhone(6498875657);
console.log(phone1, phone2);

//funções async

async function getDatabase(id:number): Promise<string> {
    return 'nome';
}

type User = {
    id: number;
    name: string;
    email: string;
};

let users: User[] = [
    { id: 1, name: 'Alice', email: 'alice@email.com' },
    { id: 2, name: 'Bob', email: 'bob@email.com' },
];

async function getUserById(id: number): Promise<User | undefined> {
    return new Promise((resolve) => {
        setTimeout(() => {
            const user = users.find(u => u.id === id);
            resolve(user);
        }, 1000);
    });
}
