class Personagem{
    protected name: string;
    public skill: number;
    forca: number;

    constructor(name: string, skill: number, forca: number){
        this.name = name;
        this.skill = skill;
        this.forca = forca
    }

    ataque(): void{
        let valor = this.skill * this.forca;
        console.log(`Ataque com valor de ${valor}`);
    }
}

class Mago extends Personagem{
    magicPoints:number
    elemento:string
    constructor(name:string, skill: number, forca:number, magicPoints:number, elemento:string){
        super(name, skill, forca);
        this.magicPoints = magicPoints;
        this.elemento = elemento
    }

    ataque(): void {
        let valor = this.magicPoints * (this.skill + this.forca);
        console.log(`Ataque magico do elemmento ${this.elemento} com poder máxino de ${valor}`);
    }
}

let mago = new Mago("Fosco", 10, 2, 20, "Ar");
mago.ataque();

