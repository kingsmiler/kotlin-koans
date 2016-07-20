package ii_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    // The details (how multi-assignment works) will be explained later in the 'Conventions' task
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

// 我的实现
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    // 返回未发货数大于发货数的客户的集合

    // 实现1
    var users = customers.filter(fun(item): Boolean {
        val (delivered, undelivered) = item.orders.partition { it.isDelivered }

        return delivered.size < undelivered.size
    }).toSet()

    // 实现2
    users = customers.filter{
        val (delivered, undelivered) = it.orders.partition { it.isDelivered }
        delivered.size < undelivered.size
    }.toSet()

    return users
}

// 参考实现
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered2(): Set<Customer> =  customers.filter {
    // Return customers who have more undelivered orders than delivered
    val (del, und) = it.orders.partition { it.isDelivered }
    und.size > del.size
}.toSet()