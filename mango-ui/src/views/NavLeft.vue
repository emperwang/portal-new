<template>
    <div>
        <template v-for="nmenu in dataList">
            <el-menu-item v-if="!nmenu.children" :index="nmenu.id" :key="nmenu.id">
                <i class="nmenu.menuIcon"></i>
                <span slot="title">{{nmenu.menuText}}</span>
            </el-menu-item>
            <el-submenu v-if="nmenu.children" :index="nmenu.id" :key="nmenu.id">
                <template slot="title">
                    <i class="nmenu.menuIcon"></i>
                    <span>{{nmenu.menuText}}</span>
                </template>
                <nav-left :dataList="nmenu.children"></nav-left>
            </el-submenu>
        </template>
    </div>
</template>

<script>
export default {
    name: 'NavLeft',
    data(){
        return {

        }
    },
    methods:{

    },
    props:['dataList']

}
</script>

<style lang="scss" scoped>

</style>