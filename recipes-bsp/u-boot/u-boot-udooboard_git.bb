require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for UDOO boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"
COMPATIBLE_MACHINE = "(udooneo)"

PROVIDES = "u-boot"

PV = "v2014.07+git${SRCPV}"

SRCREV_udooneo = "2b41110e2502a1f55250fde3fe98023249895005"
SRCBRANCH_udooneo = "l5.0.0_1.0.0-ga_neo"
SRC_URI = "git://github.com/udooboard/uboot-imx.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
