package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

@Suppress("unused")
open class CANVAS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("canvas", consumer, initialAttributes, null, false, false), HtmlBlockInlineTag {
    var width : String
        get()  = attributeStringString.get(this, "width")
        set(newValue) {attributeStringString.set(this, "width", newValue)}

    var height : String
        get()  = attributeStringString.get(this, "height")
        set(newValue) {attributeStringString.set(this, "height", newValue)}


}
val CANVAS.asFlowContent : FlowContent
    get()  = this

val CANVAS.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class CAPTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("caption", consumer, initialAttributes, null, false, false), HtmlBlockTag {

}

@Suppress("unused")
open class CITE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("cite", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val CITE.asFlowContent : FlowContent
    get()  = this

val CITE.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class CODE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("code", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val CODE.asFlowContent : FlowContent
    get()  = this

val CODE.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class COL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("col", consumer, initialAttributes, null, false, true), CommonAttributeGroupFacade {
    var span : String
        get()  = attributeStringString.get(this, "span")
        set(newValue) {attributeStringString.set(this, "span", newValue)}


}

@Suppress("unused")
open class COLGROUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("colgroup", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacade {
    var span : String
        get()  = attributeStringString.get(this, "span")
        set(newValue) {attributeStringString.set(this, "span", newValue)}


}
/**
 * Table column
 */
@HtmlTagMarker
fun COLGROUP.col(classes : String? = null, block : COL.() -> Unit = {}) : Unit = COL(attributesMapOf("class", classes), consumer).visit(block)


@Suppress("unused")
open class COMMAND(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("command", consumer, initialAttributes, null, true, true), CommonAttributeGroupFacadeFlowMetaDataPhrasingContent {
    var type : CommandType
        get()  = attributeCommandTypeEnumCommandTypeValues.get(this, "type")
        set(newValue) {attributeCommandTypeEnumCommandTypeValues.set(this, "type", newValue)}

    var label : String
        get()  = attributeStringString.get(this, "label")
        set(newValue) {attributeStringString.set(this, "label", newValue)}

    var icon : String
        get()  = attributeStringString.get(this, "icon")
        set(newValue) {attributeStringString.set(this, "icon", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var checked : Boolean
        get()  = attributeBooleanTicker.get(this, "checked")
        set(newValue) {attributeBooleanTicker.set(this, "checked", newValue)}

    var radioGroup : String
        get()  = attributeStringString.get(this, "radiogroup")
        set(newValue) {attributeStringString.set(this, "radiogroup", newValue)}


}
val COMMAND.asFlowContent : FlowContent
    get()  = this

val COMMAND.asMetaDataContent : MetaDataContent
    get()  = this

val COMMAND.asPhrasingContent : PhrasingContent
    get()  = this


