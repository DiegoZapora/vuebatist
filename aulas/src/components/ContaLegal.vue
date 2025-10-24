<template>
    <div>
        <div v-if="mostrar" class="container">
            <div v-for="u in usuarios" :key="u.id">
                <h2>{{ u.nome }}</h2>
                <p>Idade: {{ u.idade }}</p>
                <p>Profissão: {{ u.profissao }}</p>
                <hr />
            </div>
        </div>
        <button @click="showSamp(), avisoFunc(), some()">{{ texto }}</button> <br>
        <small style="color: white;">{{ aviso }}</small>
    </div>
</template>

<script>

export default {
    name: "ContaLegal",
    data() {
        return {
            usuarios: [
                {  
                    id: 1, nome: "Andre Matos", idade: 47, profissao: "Cantor"
                },

                { 
                    id: 2, nome: "Chester Bennington", idade: 41, profissao: "Cantor"
                },

                { 
                    id: 3, nome: "Jim Morrison", idade: 27, profissao: "Cantor"
                },

                { 
                    id: 4, nome: "Freddie Mercury", idade: 45, profissao: "Cantor" 
                },

                {
                    id: 5, nome: "Detran", idade: 0, profissao: "Destruidor de Sonhos"
                }
            ],
            mostrar: false,
            texto: "Mostrar Usuários",
            aviso: ""
        }
    },
    methods: {
        showSamp(e) {
            this.mostrar = !this.mostrar
            this.texto = this.mostrar ? "Esconder Usuários" : "Mostrar Usuários"
        },
        avisoFunc(e) {
            if (this.mostrar) {
                this.aviso = "Clique novamente para esconder a lista de usuários."
            } else {
                this.aviso = "Lista de usuários escondida."
            }
        },
        some(e) {
            setTimeout(() => {
                if (!this.mostrar) {
                    this.aviso = ""
                }
            }, 2500)
        }
    }
}
</script>

<style scoped>
.container {
    background-color: lightgray;
    margin-bottom: 10px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    width: 100%;
    padding: 10px;
}

p {
    margin: 5px 0;
    color: rgb(43, 76, 226);
    font-family: 'Courier New', Courier, monospace;
    font-weight: bolder;
    transition: 1s;
}

p:hover {
    color: rgb(226, 43, 43);
    transform: rotateX(360deg);
}
</style>