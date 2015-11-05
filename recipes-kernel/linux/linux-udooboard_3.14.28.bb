# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-udooboard.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# UDOOboard branch - based on 3.14.28_1.0.0_ga from Freescale git

SRCBRANCH = "imx_3.14.28_1.0.0_ga_neo"
SRCREV = "b15f827aa37a1ca71ca4e3b5c0de1c4da4a3de67"
LOCALVERSION = "_1.0.0_ga-udooboard"

B = "${S}"

COMPATIBLE_MACHINE = "udooneo"
