# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-udooboard.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# UDOOboard branch - based on 3.14.28_1.0.0_ga from Freescale git

SRCBRANCH_udooneo = "imx_3.14.28_1.0.0_ga_neo"
SRCBRANCH = "imx_3.14.28_1.0.0_ga_udoo"
SRCREV_udooneo = "580e3056277a361569ac2fe480fa7f19db77337a"
SRCREV_udooquad = "356e4b8e91a21edfd390e82d0c80239c4e0593c5"
LOCALVERSION = "_1.0.0_ga-udooboard"

COMPATIBLE_MACHINE = "(udooneo|udooquad)"
