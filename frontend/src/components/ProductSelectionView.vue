<template>

    <v-data-table
        :headers="headers"
        :items="productSelection"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ProductSelectionView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            productSelection : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/productSelections'))

            temp.data._embedded.productSelections.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.productSelection = temp.data._embedded.productSelections;
        },
        methods: {
        }
    }
</script>

