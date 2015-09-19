require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for UDOO boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"
COMPATIBLE_MACHINE = "(udooneo)"

PROVIDES = "u-boot"

PV = "v2014.07+git${SRCPV}"

SRCREV_udooneo = "d3fbdc01e9b9a2cf492f60047568cd854be3557a"
SRCBRANCH = "master"
SRC_URI = "git://github.com/udooboard/uboot-imx.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
