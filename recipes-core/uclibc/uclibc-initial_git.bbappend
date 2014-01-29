FILESEXTRAPATHS_prepend := "${THISDIR}/uclibc_git:"

SRC_URI += "file://add-missing-IT-instruction-for-Thumb2.patch \
	    file://move-check-for-BX-to-its-own-header.patch \
	   "
