<template>
    <div>
        <p>Nome: {{ nome }}, idade: {{ idade }}</p>
    </div>
</template>

<script>

export default {
    name: "Pc",
    data() {
        return {
            nome: "Andre Matos",
            idade: 47
        }
    }
}

</script>
