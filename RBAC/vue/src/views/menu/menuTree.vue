<template>
    <div>
        <template v-for="item in this.menuList">
            <el-submenu :disabled="item.menuDisable" :index="item.id" :key="item.id"
             v-if="item.children.lenth>0">
                <template slot="title">
                    <i :class="item.menuIcon"></i>
                    <span slot="title">{{item.menuText}}</span>
                </template>
                <menuTree :mentList="item.children"></menuTree>
            </el-submenu>
            <el-menu-item
                v-else
                :disabled="item.menuDisable"
                :key="item.id">{{item.menuText}}</el-menu-item>
        </template>
    </div>
</template>

<script>
export default {
    name:'menuTree',
    data(){
        return {

        }
    },
    beforeMount(){},
    props: ["menuList"],
    methods: {

    }
}
</script>

<style lang="scss" scoped>

</style>