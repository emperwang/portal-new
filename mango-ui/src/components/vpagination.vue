<template>
    <div>
        <div>
            <span>页数较少的效果</span>
            <el-pagination
            background
                layout="prev, pager,next"
                :total="50"
            ></el-pagination>
        </div>

        <div>
            <span>大于7页的效果</span>
            <el-pagination
            layout="prev,pager,next"
            :total="1000"
            ></el-pagination>
        </div>
    </div>
</template>
<script>
export default {
    name: 'vpagination',
    data(){
        return {

        }
    }
}
</script>

<style lang="scss" scoped>

</style>