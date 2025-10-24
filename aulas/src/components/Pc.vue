<template>
    <div>
        <Props :usuarios="usuarios" />
    </div>
</template>

<script>;
import Props from './Props.vue';

export default {
    name: "Pc",
    components: {
        Props
    },
    data() {
        return {
            propsNome: "Andre Matos",
            propsIdade: 47,
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
            ]
        }
    }
}

</script>

<style scoped>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        color: white;
        font-family: 'Courier New', Courier, monospace;
        font-weight: bold;
    }
</style>
