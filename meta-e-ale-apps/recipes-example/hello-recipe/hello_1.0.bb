DESCRIPTION = "Hello World example"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}"

SRC_URI = "file://hello.c"

do_compile() {
        ${CC} ${CFLAGS} ${LDFLAGS} hello.c -o hello
}

do_install() {
        install -d -m 0755 ${D}/${bindir}
        install -m 0755 hello ${D}/${bindir}/hello
}

