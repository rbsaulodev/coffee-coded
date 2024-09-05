class CardApp extends HTMLElement {
    constructor() {
        super();
        
        const shadow = this.attachShadow({mode: "open"});
        shadow.appendChild(this.build());
        shadow.appendChild(this.style());
    }

    build() {
        const componentRoot = document.createElement("div");
        componentRoot.setAttribute("class", "card");
        
        const img = document.createElement("img");
        img.src = "assets/icon.jpeg";
        img.alt = "Darth Vader";
        
        const content = document.createElement("div");
        content.setAttribute("class", "content");

        const h2 = document.createElement("h2");
        const p = document.createElement("p");
        const btn = document.createElement("button");
        btn.setAttribute("id", "subscribeButton");

        const metadata = document.createElement("div");
        metadata.setAttribute("class", "metadata");

        const spanAuthor = document.createElement("span");
        spanAuthor.setAttribute("class", "author");
        const spanDate = document.createElement("span");
        spanDate.setAttribute("class", "date");
        const spanReadTime = document.createElement("span");
        spanReadTime.setAttribute("class", "read-time");
        const spanSource = document.createElement("span");
        spanSource.setAttribute("class", "source");

        h2.textContent = this.getAttribute("title") || "Default Title";
        p.textContent = this.getAttribute("description") || "Default description";
        btn.textContent = "Se Inscrever";

        btn.addEventListener('click', () => {
            alert("Inscrição feita com Sucesso!")
            btn.textContent = "Inscrito!";
            btn.disabled = true;
        });

        spanAuthor.textContent = this.getAttribute("autor") || "Anonymous";
        spanDate.textContent = this.getAttribute("date");
        spanReadTime.textContent = this.getAttribute("readTime");
        spanSource.textContent = this.getAttribute("src");

        content.appendChild(h2);
        content.appendChild(p);
        content.appendChild(btn);
        
        metadata.appendChild(spanAuthor);
        metadata.appendChild(spanDate);
        metadata.appendChild(spanReadTime);
        metadata.appendChild(spanSource);

        content.appendChild(metadata);

        componentRoot.appendChild(img);
        componentRoot.appendChild(content);

        return componentRoot;
    }

    style() {
        const style = document.createElement("style");
        style.textContent = `
            .card {
                max-width: 400px;
                border: 1px solid #444;
                border-radius: 8px; 
                overflow: hidden;
                box-shadow: 0 4px 8px rgba(0,0,0,0.1);
                background-color: #1a1a1a;
                font-family: Arial, sans-serif;
                margin: 0 auto;
            }

            .card img {
                width: 100%;
                height: auto;
                object-fit: cover;
            }

            .content {
                padding: 16px;
            }

            .content h2 {
                color: #e0e0e0;
                font-size: 1.4em;
                margin-top: 0;
                margin-bottom: 10px;
            }

            .content p {
                color: #b0b0b0;
                font-size: 1em;
                line-height: 1.5;
                margin-bottom: 15px;
            }

            .metadata {
                font-size: 0.8em;
                color: #888;
                display: flex;
                flex-wrap: wrap;
                gap: 10px;
            }

            .metadata span {
                display: inline-block;
            }

            .author {
                color: #ff9800;
                font-weight: bold;
            }

            .date, .read-time, .source {
                color: #888;
            }

            #subscribeButton {
                padding: 0.5rem 1rem; 
                margin-bottom: 0.8rem;
                background-color: #ff9800; 
                color: white; 
                border: none; 
                border-radius: 4px; 
                font-size: 1rem; 
                cursor: pointer;
                transition: background-color 0.3s ease, transform 0.3s ease;
                text-align: center;
            }
            
            #subscribeButton:hover {
                background-color: #e68a00;
                transform: scale(1.05);
            }
        `;
        return style;
    }
}   
customElements.define("card-app", CardApp);