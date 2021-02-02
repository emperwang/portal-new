<template>
    <div>
        <template v-for="item in this.menuList">
            <el-submenu :disabled="item.menuDisable" :index="item.id+''" :key="item.id+''"
             v-if="item.children">
                <template slot="title">
                    <i :class="item.menuIcon"></i>
                    <span slot="title">{{item.menuText}}</span>
                </template>
                <MenuTree :menuList="item.children"></MenuTree>
            </el-submenu>
            <el-menu-item
                v-else
                :disabled="item.menuDisable"
                :index="item.id+''"
                :key="item.id">
                <i :class="item.menuIcon"></i>
                <span>{{item.menuText}}</span>
                </el-menu-item>
        </template>
    </div>
</template>

<script>
export default {
    name:'MenuTree',
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