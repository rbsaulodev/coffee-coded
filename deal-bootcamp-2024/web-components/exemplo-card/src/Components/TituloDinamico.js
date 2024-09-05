class TituloDinamico extends HTMLElement{
    constructor(){
        super();
        const shadow = this.attachShadow({mode: "open"})
        
        const text = document.createElement("h1");
        text.textContent = this.getAttribute("title");

        const style = document.createElement("style");
        style.textContent = `h1{color: red;}`

        shadow.appendChild(text);
        shadow.appendChild(style);
    }
}
customElements.define("titulo-dinamico", TituloDinamico);