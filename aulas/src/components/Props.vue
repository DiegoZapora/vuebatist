<template>
    <div>
        <div v-for="u in usuarios" :key="u.id">
            <h3>Nome: {{ u.nome }}</h3>
            <p>Idade {{ u.idade }}</p>
            <p>Profissão: {{ u.profissao }}</p>
        </div>
    </div>
</template>

<script>
export default {
    name: "Props",
    props: {
        usuarios: {
            type: Array,
            required: true
        }
    }
}
</script>