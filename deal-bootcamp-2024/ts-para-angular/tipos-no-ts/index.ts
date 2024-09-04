// tipos primitivos: boolean, number, string
let ligado:boolean = false;
let nome:string = "saulo";
let idade:number = 19;
let altura:number = 1.95;

//tipo null e undefined lembrando que se a varivael for null ela só pode receber null e o mesmo vale para o undefined
let nulo:null = null;
let indefinido: undefined = undefined;

//any e void, dois tipos são usando muito em funções que pode retonar algo ou que pode retornar vazio
let retornoView:any = "qualquer coisa" //aceita qualquer coisa
let retorno:void //pode deixar assim ou com = void

//Objeto tipado - sem previsibilidade
let produto:object = {
    name: "Copo",
    cor: "azul",
    litros: "1l",
    valor: 80
};

//Objeto tipado - com previsibilidade 
type produtoLoja = {
    name:string
    cor:string
    litros:string
    valor:number
}

let produtoCopo:produtoLoja = {
    name: "Copo",
    cor: "azul",
    litros: "1l",
    valor: 80,
}

// Arrays
let dados:string[] = ["produto1", "produto2"];
let dados2:Array<number> = [1, 2, 3];

//Tuplas
let boleto:[string, number, number] = ["agua boleto", 199.90, 873213789127392];

//Dates
let niver:Date = new Date(2005, 12, 6, 12, 30, 20);
let niver2:Date = new Date("06-12-2005 00:30:40");
console.log(niver);
console.log(niver2);

