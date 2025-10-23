<template>
    <div>
        <h2>Eae mano {{ nome }}</h2>
        <div v-if="musicas">
            <Info />
        </div>
        <div v-else>
            <h3>Sem musica</h3>
        </div>
        <div>
            <p>Conta legal: {{ contador }}</p>
            <button v-on:click="mais1">+1</button>
            <p v-show="contador == 47">Andre Matos</p>
        </div>
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
            nome: "Andre",
            musicas: false,
            contador: 0
        }
    },
    methods: {
        mais1() {
            this.contador+=2;
        }
    }
}

</script>