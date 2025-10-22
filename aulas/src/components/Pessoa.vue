<template>
    <div>
        <h2>Eae mano {{ nome }}</h2>
        <Info />
    </div>
</template>

<script>
import Info from './Info.vue';

export default {
    name: "Pessoa",
    components: {
        Info
    },
    data() {
        return {
            nome: "Andre"
        }
    }
}

</script>