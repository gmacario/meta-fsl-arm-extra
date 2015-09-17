# Common settings for wandboard boards

include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa9.inc

PREFERRED_PROVIDER_virtual/kernel ?= "linux-udooboard"
PREFERRED_VERSION_linux-udooboard ?= "3.14.28"

PREFERRED_PROVIDER_u-boot ?= "u-boot-udooboard"

SERIAL_CONSOLE = "115200 ttymxc0"

MACHINE_FEATURES += " "

KERNEL_IMAGETYPE = "zImage"
