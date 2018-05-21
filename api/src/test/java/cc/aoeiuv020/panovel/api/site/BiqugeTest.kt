package cc.aoeiuv020.panovel.api.site

import org.junit.Test

/**
 *
 * Created by AoEiuV020 on 2017.10.08-21:52:04.
 */
class BiqugeTest : BaseNovelContextText(Biquge::class) {
    @Test
    fun search() {
        search("都市")
        search("最大权限")
    }

    @Test
    fun detail() {
        detail(
                "18156",
                "最大权限", "肥鱼马甲",
                "18156",
                "https://www.biqubao.com/cover/18/18156/18156s.jpg",
                "制作游戏成功的林陨意外猝死，穿越到自己制作的游戏世界，结果拥有了这个世界的最大权限！\n" +
                        "最大权限书友群：305908807",
                "2018-04-26T21:42:32.000+0800"

        )
    }

    @Test
    fun chapters() {
        chapters("18156",
                "序章", "18156/7491883", null,
                "第505章 格斗", "18156/9637191", "2018-04-25T21:42:32.000+0800",
                515)
        chapters("18156",
                "序章", "18156/7491883", null,
                "关于本书和新书的一些事情", "18156/10188197", "2018-04-26T21:42:32.000+0800",
                516)
    }

    @Test
    fun content() {
        content("18156/8791124",
                "中年男子下意识的接住魂晶，这东西能够让卡片使更好的修炼魂力，可以说是硬通货，属于最高等的金钱。",
                "“没什么，绿色级别吗，这不是问题。”林陨摇了摇头，接着拿出一张卡片，直接激发，同时林陨的气息也迅速增强，瞬间魂力翻倍，直接突破一千，迈过绿色级别的门槛。",
                38)
    }
}