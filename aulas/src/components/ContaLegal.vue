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
        <button @click="showSamp">{{ texto }}</button>
    </div>
</template>

<script>

export default {
    name: "ContaLegal",
    data() {
        return {
            usuarios: {
                usuario1: {
                    id: 1,
                    nome: "Andre Matos",
                    idade: 47,
                    profissao: "Cantor",
                },
                usuario2: {
                    id: 2,
                    nome: "Chester Bennington",
                    idade: 41,
                    profissao: "Cantor",
                },
                usuario4: {
                    id: 4,
                    nome: "Freddie Mercury",
                    idade: 45,
                    profissao: "Cantor",
                    status: "Falecido",
                    ano: 1991
                },
                usuario5: {
                    id: 5,
                    nome: "Jim Morrison",
                    idade: 27,
                    profissao: "Cantor",
                },
                usuario6: {
                    id: 6,
                    nome: "Mike Shinoda",
                    idade: 44,
                    profissao: "Músico e produtor musical",
                }
            },
            mostrar: true,
            texto: "Mostrar Usuários"
        }
    },
    methods: {
        showSamp() {
            this.mostrar = !this.mostrar
            this.texto = this.mostrar ? "Esconder Usuários" : "Mostrar Usuários"
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