<template>
    <h1>Nome: {{ nome }}</h1>
</template>

<script>

export default {
    name: "LCH",
    data() {
        return {
            nome: "Carregando..."
        }
    },
    created() {
        setInterval(() => {
            this.nome = "Andre Matos"
        }, 2000)
    },
    mounted() {
        setTimeout(() => {
            this.nome = "Diego"
        }, 3000)
    }
}

</script>