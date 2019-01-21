package ru.evotor.framework.payment.method

import java.util.*

/**
 * Способ оплаты
 */
sealed class PaymentMethod(val uuid: UUID) {
    /**
     * Стандартный способ оплаты "Наличные"
     */
    class DefaultCash : PaymentMethod(UUID) {
        companion object {
            private val UUID = java.util.UUID.fromString("")
        }
    }

    /**
     * Стандартный способ оплаты "Банковская карта"
     */
    class DefaultCashless : PaymentMethod(UUID) {
        companion object {
            private val UUID = java.util.UUID.fromString("")
        }
    }

    /**
     * Способ оплаты через стороннюю интеграцию, установленную на терминал из Эвотор.Маркета
     */
    class ThirdPartyIntegration(uuid: UUID) : PaymentMethod(uuid) {

     /*   class Query : FilterBuilder<Query, Query.SortOrder, ThirdPartyIntegration>() {
            val appUuid = addFieldFilter<UUID>("")

            class SortOrder : FilterBuilder.SortOrder<SortOrder>() {

            }

            override fun getValue(context: Context, cursor: Cursor<ThirdPartyIntegration>): ThirdPartyIntegration =
        }*/
    }
}