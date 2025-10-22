<template>
    <form>
        <input type="text" v-model="inputName" placeholder="Digite seu nome">
        <button type="submit" v-on:click="submitForm">Enviar</button>
    </form>
    <p>Em tempo real: {{ inputName }}</p>
    <p v-if="name">Seu nome é: {{ name }}</p>
    <img v-if="inputName === andre" v-bind:src="sas" class="sasClass">
</template>

<script>
import sas from "../../public/sas.png"

export default {

    data() {

        return {
            inputName: "",
            name: "",
            sas,
            andre: "Andre Matos"
        }

    },

    methods: {

        submitForm(e) {
            e.preventDefault()
            this.name = this.inputName
        }
    }

}
</script>

<style>
    .sasClass {
        width: 300px;
        display: block;
        margin: 0 auto;
        border-radius: 10px;
    }
</style>