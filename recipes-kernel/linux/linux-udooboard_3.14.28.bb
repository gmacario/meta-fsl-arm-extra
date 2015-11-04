# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-udooboard.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# UDOOboard branch - based on 3.14.28_1.0.0_ga from Freescale git

SRCBRANCH_udooneo = "imx_3.14.28_1.0.0_ga_neo"
SRCBRANCH = "imx_3.14.28_1.0.0_ga_udoo"
SRCREV_udooneo = "b15f827aa37a1ca71ca4e3b5c0de1c4da4a3de67"
SRCREV_udooquad = "356e4b8e91a21edfd390e82d0c80239c4e0593c5"
LOCALVERSION = "_1.0.0_ga-udooboard"


B = "${S}"

SRC_URI_append_udooneo = "file://0001-remove-TIMESTAMP-if-gcc-4.9-is-used.patch \
"



COMPATIBLE_MACHINE = "(udooneo|udooquad)"
