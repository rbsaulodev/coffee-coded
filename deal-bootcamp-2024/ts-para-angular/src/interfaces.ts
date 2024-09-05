interface robot {
    id: number | string;
    nome: string;
    funcoes: string;
    playMusic():string;
    sayHello():string
}

class Pessoa implements robot{
    id: number | string;
    nome: string;
    funcoes: string;

    constructor(id:number | string, nome:string, funcoes:string){
        this.id = id;
        this.nome = nome
        this.funcoes = funcoes
    }
    playMusic(): string {
        return 'tocando música'
    }
    sayHello(): string {
        return 'hello';
    }

}