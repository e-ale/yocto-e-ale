# look for files in this layer first
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

COMPATIBLE_MACHINE = "pocketbeagle"

SRC_URI += "\
    file://0001-am335x_evm-uEnv.txt-bootz-n-fixes.patch \
    file://0002-U-Boot-BeagleBone-Cape-Manager.patch \
    file://0003-pocketbeagle-tweaks.patch \
    file://uEnv.txt \
"
