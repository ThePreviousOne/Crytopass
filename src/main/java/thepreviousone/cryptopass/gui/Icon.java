package thepreviousone.cryptopass.gui;

import org.apache.commons.codec.binary.Base64;

public class Icon {

    private StringBuilder icon;

    /**
     * Decodes the base64 string into byte array
     *
     * @param imageDataString - a {@link java.lang.String}
     * @return byte array
     */
    public static byte[] decodeImage(String imageDataString) {
        return Base64.decodeBase64(imageDataString);
    }

    public String get() {
        return icon.toString();
    }

    public Icon() {
        icon = new StringBuilder().append("iVBORw0KGgoAAAANSUhEUgAAAIAAAACACAYAAADDPmHLAAABcWlDQ1BpY2MAACiRdZE9S8NQFIbfpkqrVjroIOKQoYpDC0VBOmod")
                .append("ugQptYJVl-Q2aYUkDUmKFFfBxaHgILr4NfgPdBVcFQRBEUQE_4Ffi5R4blNokfaEm_Pw3vMe7j0XECSdGU5fEjBM185l0uJqYU0M")
                .append("vUPAAMIIICUzx1rIZiX0jJ9HqqN4SPBeveu6xlBRdRgQCBPPMct2ieeJpS3X4rxHPMrKcpH4hDhu0wGJb7mu-PzGueTzF2c7n1sE")
                .append("BN5TLHWw0sGsbBvE08QxQ6-y1nn4TSKqubJMeZzWBBzkkEEaIhRUsQkdLhKUTZpZd1-y6VtChTyM_hZqsMlRQpm8cVKr1FWlrJGu")
                .append("0qejxuf-f56ONjvjd4-kgf5Xz_ucBEL7QKPueb-nntc4A4IvwLXZ9ldoTqlv0uttLXYMRHeAy5u2phwAV7vA2LMl23JTCtISNA34")
                .append("uACGC8DIPTC47s-qtY_zJyC_TU90BxweAVNUH934A6rKZ-P1-ipAAAAACXBIWXMAAA7DAAAOwwHHb6hkAAAZqklEQVR42u1dd3Mb")
                .append("R5afnoA0SATADOYkUhKVgynJlmTv2rLX5_XZe3V1u1VbV_fnfZ37Ale7e7XJOnsdZFmOss6WbVmixJwDSDCBIDIwA8z0dU8AQIoE")
                .append("AQoSIXBeGUWTasxM9_u92K_fEIRGGmmkkUYaaaSRRhpppJFGGmmkkUYaaaSRRhpppJFGGmmkkUYaaVRuBIp5MUPDb0C9u9Wg1zFm")
                .append("kqFYAIARQMgQEAICAG21CyEIEXfQ6gGQRP8XF_lUlOOTkcWFqUTC83dYrNvQxYPSL6kKa7XpyIl2R1eH2-WssNhMRr2ZoUk9CSXu")
                .append("g5IVAViSzwVFhIJkSuRicT68vhEKjU0s-GKhgH8JXIkR8CuhhABwlWo9c9Lcc7S5-nhPS0Nba02t3WaxsiY9y9CUngSAlBZZUwJ5")
                .append("Sr_8AwFATCYFLhrnooFgOGRk6CWBS3mGWNvKzI9ChCBuC_sOAHPru8BsqGS7DzfWnD93qKmrra7JUWFxIsYzpESAlPS_xvyCQYCk")
                .append("BiLhoZAWNbBGndWo1xkZHUNBUQCJqH8pwlnD4cmP4L4CoLq6zXD4eJvjeE9zQydifqXL5tLRtF5CMIQQfURCMmcaTwt1AQgg85am")
                .append("KAp_XGhtIVpMnuNEykBzQ_2TSQSA-L4CADt83R1uZ1trXS2y-07EfAPEzw-h_PTI_0MTARBqTC3cN8EIgJIgIYca6NHaOiusaK3r")
                .append("E1xS2JgcXoiiUfsLAIC8fYfTanfYLVYaqX38wBDKVgw_dHo2mgbYCwikhYMKYUOK1xivtaPCakdrv45Gre0rAJCJN7IGA4sdPgpZ")
                .append("fBEBVjP5RcYBWk8om1QRrzFea9ZkQGE2aXxi_j3xw0GRYShSz1CUTvL2ZRVQumHf86oL5DXFTiGJ1xqvOV77fQeA_GD4uZAyUAhq")
                .append("Bv8pOIWQAGnCfENrLoNinwGwjXsPNJf_qZiBx3IFRVhnsigPJ8UrGtOfqXcIQFHULFnEZ9Iw8KzCwyKuM6mt6MEmDQAaADQ6yEQf")
                .append("oLnuxWkCGgCe-_AZApIkIUlRMN_8JM5ki6IIoChCpTADaAB4ToUeI2DRM2OanRqzJ3melrOqYEdJxwkXmqaFuoaWcGNLR1gGjqYB")
                .append("nteYCUJRIPt_ulP3xSfv9cXjUTNOW-6YQFF2sXQ6PXfmwss_17mbBvSUUSxnU1DuJkBiXCIe1QU2fK54LGqVeQ9y2QxCpzfE4tGI")
                .append("Xlb-5Z3aLvsoANcj6XTGFAlImK9fRyKeIxBkfUczAc-tD0ACChqMxiTyBEUpiQZ2BwEeq9fr0XfKf1-rzDUA8vspEhpNLI80uag4")
                .append("hbuCBmt9vcGYRNEDAQmoASAPQStZJwmHgEaTGTNTlJ8V5E4VQKnIRTCyZp4kqVKuZQOlAwBQ0joA6A0GgaaZJMZpLv6r2oGkSNFs")
                .append("sXEUCgHLvZq17J1ArMJpRicyKLTDqj2n_Cv_iiRfYFkrj3yBsncCyQPAf4JhdIJOr-d2df6AnC9G43msNQ7CebZyBwB24yGSfgE5")
                .append("dZxSW7kLCKQQMIFBo5gEqAHgeQ4DkNXX6XSiwWBM5FNFI0UARlOC0RsEqBzP0ACwT-pbZpjEtD1LIa6lRBItGowsNgHi7pAB0GRi")
                .append("Y3oEgCJUN2fPQQNAVrBF5OCqdAhCEAQQj8WolJAC0oYMkMK4Hb-20zWxE4AAIJhYc34aAIHExFriSGNgE5AX-rLuDVWmo2eWwBaP")
                .append("x6gkz5Hq4Y5d5v7Mid5PAGwnXvIJGEBMjw_Zv_vmZpvV7oj2HD21XNfYErHZKpL4GyIUlcNzWbt4O10TjdPrjQJmar4mgDVbY8hn")
                .append("EDAHRSKvMjysaFD0AKT6-Gg4RK8sLZimxgads1OjVW1dR5ZfeuXNeRxViIo6KJUSyn0DwE4LoB4nG3hwt-77b26-kEolme-_vrHa")
                .append("3H5otrP7mLej-5ivrqElotPpRem4hChleNPnT7cBFN7dE1mzJSFnA9M19tsDADHRbLXFDUaTILN1R0Ypx99IyU7wSZ5c9M6zU6MD")
                .append("zqmxgZqZydFG3-pSDcclTMHA-s8nzl5aslc4eXxzUEJnZUttL0CS_lBgg0GSUxsJBytEUaDisYh1ecnTNHD_brCqpn6pqa1r4fCx")
                .append("M57OnuPrNruTp2kGSoeQt2gFBVA4sSNlA2mGSSaTvFEp8tg-CUTSSbPFlsC5AzQYEI9XkUjPiBmPwAkiYb9ucnSwYqD_R_fs5Ih7")
                .append("dWmhPhIJ2lPJpA4qiQXvwlzd3NSozXH20qqYSskXOMAAwOlVoJxr2MQJrP6R7STmZsasy4ueGsR81UcBQiqlCwb8laHghmt-ZqLj")
                .append("4b3vfHXuZgyEme7e0ytYK5jMlpRSxQMyUYAkq8BoMvEoHEzgLWG4zdlFVSvo9foE0hacLKUQiDD9nJJ5wKffYrEI7fXMsKOD96uG")
                .append("H91rXvTMuIP-dRfHxdnsdjjSmT503YB_rXJmatTZe-rCGqFsL2-d-4HSAOlwHAL1F6CqfxExEKlP54Z_tVK1CFsEBvB8wri24m3w")
                .append("-1Zrp8aHDiFfYan90JGZnt4zC91HTvpsDhcPZPug4oowmtgkLvQgdjY90k-90RhjzTY-rRGkM1hyRhCBTzc21O8YfPBDw_jow1as")
                .append("4hGgLKIgMGmzkv28iqZBZsA4PT5ch4AwU-Gs5KXn2jL3A6UBCAgz58ZluyyfhkcLHdjw6aYnh2u5RJzdqikzv8uNfZCGoKPITEQj")
                .append("IRuSyJaH9773Nbd1TfeePD9z9OQLK67K2jjNSFOEyAlMomiA2-3RjAY2brHa8DhIkhSRSnHk6vKKETG9erD_h-bZ6bHmwPpaFc9z")
                .append("xmxpJ8E2lh2LuSgSCCD04vy0e9nrYR2uKg6o4WVm7gcKAFkZ1szmPJYgigJwZcnDLs5Nu1EYSOO_4S1ZIofEKrqExLZ9bWWxYWN9")
                .append("pWZydKDr7refe46ePDdx4sxFb0NzZ9hitXMotIvncgCxZUKaImZ3VCaQfSc9s5Pm_p--dT-6f7d9aWHOHQ5tOFLIFGXaHoBd60UV")
                .append("MwCQ-XJMjQ-6Ont6AyDjrh5ME7BT-IUWl0Qq3RXw-1xKU4x8vrfpdwQcZsO_VhMM-l3z02NtD368M3fy3Isjza1d63I6GOyodvGl")
                .append("DCZTYn1t2Xj39s3mR_e_71zyzDZFoxEL1jaqOSrEh1PHYv9gYvSR-6XoP82aLdYUdlVKwRcsFQBI3I5GwvTE8MN6LhEzFbrQW8GA")
                .append("VC8dDgcdEyOPsHloRA7jfCjot8uuwePgUrQN0kALNX_97_-6vOydb0T23Yx8EmovjN9KyIllkBapRdc1tXcdDZZKHFAiAMDOElr8")
                .append("ZY_JuzBbi9Sv7km04yYgQJEKhwLOibEBu3SKGRLbahZVVaMwrhH_ihhPFoPxWSEmCG6sO0eHHlS1dx0JAlAajfNKYi8A2168SGOD")
                .append("DyrRIrmwmS5GMV42A5FGoLAaJ4idAUDIu4cUlLqzFYf52c8Ri0assxMjtbFYlC6VXFBJAABzhIvHqOnxobpIJGTPjqGLkTXPZmYu")
                .append("huY7rnCvV9YCOKu56Jmt9cxMWshdik2e1Z7BPpmALdoP8RrZa50gpEiTiQ1xHGdMJXkdtr_bJO1K_qRWtvbKZBgpgdHpEtjdiYQD")
                .append("u5o4uEvK_DnPA6i1N5JFlvICVmsF_-Zv_v1-T-_ZubnpsaqlxbkqFA3gGN-Kky3JJPYLIKm0odskXfutTXcyV0jKBYPRFDFb7Ruu")
                .append("ytq1ptbOxa7DJ5Y7uo_5kTkCj0vCFq1RphoAqL2j1WgaO186vV5s6zwSamnvDnOJ-DxiOo08ZnZmaszh9Uw71pa9Tr9v1RkMrDsS")
                .append("iRiLkyuSXcdJlS2xvQSvIjcoT-cP4OZCcahsGGEgYymnGZpnWWvQ7nCtu6pq191Nrasdh46tNrZ0hMwWG8_o9ZK_ozZ9ypEsy3RX")
                .append("zBG6PscAyLSPVB0wJBXS35HUiAYTy1e4qriuo6f8iNlk0L-m83pmzQgUFu_ifMWKd9617ltxhIMbFVwiIZkMHD1kmw1VMPdqMrZK")
                .append("trzhpEg3ReFKY55mGF6vM8St9oqNqtqGVXdDy1pNfVOgzt0UrnU3R0ysWcAZTkLOTROCDCA5xb1LtjStIMoMALlmks4KqpIGZfsJ")
                .append("nZW1XGV1XeIYuOBLxGPzoYCfCQY39Bu-VcOiZ8aOwkenb8XrRH-3xWIRczwWY3kuYcK7iequXL5AkO4P0t1O8QZVSsfoOWzDcb2g")
                .append("0WSOWu2OYGVVrb-mvnEDMTtY4aqOVTgqObzli3cS8TY1AgyQpV0E2Wcn8rDr6S5QQK5rBeVkAjap0F2OaSgVOVJcSAhKc3SG0YsI")
                .append("DFxVjTtBdMEg8g9WOS5BJRJxyu9bNizMTtmQprAvLcy5JkYHugL-tep8M4sKAqQns9mdq8huTztcVUGLrSJmr3BFXZU1EcT0CAIA")
                .append("j-sMcLUR0gKSwpYYLYqEkEqSO00t37lnxoK8xj6XGgAUrinUbTYCp1IJQpS7Z5Ik3u3Dp3kEh7OS6-jqDUajYe8n1__YNTHysGuv")
                .append("AEUMJZHtXnrjnd-P2Cscyg4hUDu3SokjKAFTSPfJI4s0d2VM1jmGp2MFSs0E7GVsxmxgVCAwxKJh-uaHf2n_5tYHfcGAv6og6VdN")
                .append("BfpOKBRw3vnqxgvYoXj97d-NIseOw7t7OGu81zkVMneleIggAXxqVqCkAVAQUOReMBCbgc8_-Xvblzfeu7S-tlyvMr9QAEimRxRJ")
                .append("ZD5qbn_-4SWco3jznd8PSyDYUnkEnhL4FQDITYKfEgBKsSq48HFSTEVC5AuQt2992PTlp9f7_L6Vup2ZD9UW7IT62SkriK-BHMvK")
                .append("__vqRt-N9_90CBeFADl3AfeStStkrFyBpI6F5QeAYoxVqoihIArgu9uf1d_66C99uC4gezNnWx8PSRQK4zgUYaRUDOUAAYFB8O2X")
                .append("H_fd_MefO6OREI21DdwGBMWcuwIAJdMANQ2wbbCsREsPfrxd_en7f3phyTvfIgqZLdztQjylERTf0t49UlvfNIPPHOSjCQJ-XzX2")
                .append("K2599NcOnKhSQfC0NIASBYHCjUdpA0A-c68ETrntJZQzYtuf0ZPbviHmjA7er7hx_U9nF2YnO4RUis5l85WCTALZ8tWr1_755wtX")
                .append("Xr_HWiwbRA41mw0C__pa7Vc33-_7-rMPmlJJnpSSPDDnc-5p7pl8wdNtvrAvGkCeFNzNuCkZEEiAHRlDQsR088fv_eHk1PhQD84E")
                .append("7sZ8yfNl9InOnuOjp89fXnrh8i_nWjsOjyONkJR5swsIkGnxrS65v_jk733f375Zj3P6pHTsfOfn3NvcoQIWCeawnACQkRblLRg5")
                .append("NbwiMdnjZLtPQsQIA2J-7_DAveO4Ung3b1_Jv0NXZY33_KVfTLJWW7Kqxh2_cPm14Qpn1bIs5DBndIA_2L9Y9nqaP_3gz-cf_HSn")
                .append("ilB2t-Du3lq-c5c3MvALWMDTrR0k90UBqBW0uSe37Tjp7ABJwUg4yHz6wf903__x9ulEPGrJh_mYcAu47t5TY-jjU_92_Oyl5cO9")
                .append("Z4Z0emM8e2wuEKCwkPbMTnR-cv0P50YHHzg2ZW-LM3fZAyxDAOxddUjMJyHHxSkU57ciFXwWAcGxmzXN7L6RYnWte6HvxdcmWdYi")
                .append("4NpA_LFY7MlLr_xqrLa-cVZ67xWEeYEAn_6ZGhvq-QiZIAQGiwzA4vQUgHvIG5Q1AFT1jdOuP3x7q_6bW_84j7zymkISPSaWDR0_")
                .append("c3Gw7dDhDbyzhwVWDulFouNQb-B039UB1mLdyDdZhD_Y9Aw_unfs4-t_7F1fW9YDQMGilLMpzNEAkMV8vODDD39yojDszMqSpzFX")
                .append("rL9V-vH2bWNzx1TfS6_N6A1GfABJ2Y2WjmoBRqcXL1y-NtvedXQUb_PupgWyQcAhE9T_052Tn_7jz4dwjoDckiPYKwCABoCshAhJ")
                .append("EnPT45aP__ePp9HPTnxwJB_JV_lgtTt8Zy--MtTQ3BbBW7XZX5PbwYpETW1D7OLVN4ZcVTVe-QhffjzEo7Ap-uH2Z2e__uz9Fp7n")
                .append("KFAEEDwLIp8P6ScJ38qS8ePrf-gdH-o_kkzyhkKYzzA6rgNJ9pkLLy9iB3K7YlO1GQQyESvHTl8YwKVcuzmEj-cIVnGO4NyPd76o")
                .append("FVMpUnEKoQaAHV2cfKSfJHDF8K1P_tbRf-_OKezx5-scpcO-qmrvxavXRpyuqoQoSf-2ZeFSAYeJNacuvfyrCWQuJimKShViCqTw")
                .append("cHGu5bMP_3J2fOSRXXH14V7nXq4AgNIudybrkjsZgv4HqVQysL5mxlm-zIlvIi_px5Lce_riwJET59fU4hJCSbBsvYyS6CFa2rtD")
                .append("F668_tDmcK3mowU235cACKTGjfUV4zYozXfuZQ0AJb4l88oD4IPUrMWWfP3Xvx1EDtwdR2W1Fxdf5pJM9d-wBDe1do2_-MqbEyZW")
                .append("6h0gVeLhe-8QXwP1DSPnLr2yePTE-QHkMEZzgSB7R9FgMEU7unsfXXv7d98eO31xVfkS2MPcnxmVRFFoLgBApSNHc_uh0L_8_j_7")
                .append("6xtb129_8dGpxfmpVp7jjNnSu1n1E9Be4Vrtu_zaQHNrVxhLtrLPD7ZWlW81BUiVE1abg7_y6tsji_PTtdPjQ4dxsel291HOFIro")
                .append("XmtHT73Q_4s33h1u7TgclJxA2dyAPcy9rAFQaAGFxDDMFIvVzr_yxm-m3U1tARQK-kYGfj6K28hkF31mZfzih4-fHTwnOX4kFLOY")
                .append("sWspGpCbS7R1HQn0XbnWv762UoXrCons6iPlJy4UrXM3z1y48sb9i1dfn8Mlafhe8kYlAE8y97IFQAFFodljgaLW4ZHjZ9crq-vu")
                .append("fn3z_bW7d26d8q143alUilGZgmN-d1P71JVXfz1stTv5bObnaXjT9zp_6Zeeucmx_h_ufHYpEY-z2c6l2WLbOHTk5NDLb7z7sKf3")
                .append("zDqKNkRRbloFnnTuB0ID7LEoVArQq1HM_ta__sdwfVPrxpc3rp-YmRw5lIjH8DuBCIejcvnFl9-8j-xxUM34FVpdq5oCu8OFtM67")
                .append("w8veuerJ0YGjOP9A0XQSAXDh7IWX7yMzMVlT1xgTEShEFEWQu9wClJgmeF6LQqXEDW7meOHyawu19U3hzz_-m-_hve9O8FzCgGL5")
                .append("_r6XXvVQFC2Kj9vhQkAgRQWtHT2hl37x1oON9TVHOBRwoChh7Mprb98_ff7yssHIClI5eJ4H1DQTQBStKBSoTnZb55Ggq7LmZzdy")
                .append("ENdWlqyIOWNmqy35JMxPO2r4HsiHONN31Rvw-75HPoeh7_K1aRwqktIrZfJnvgaAp4QlrA1sFU7-1bf-bRJpABI3eSy0FDyXGsBa")
                .append("ACeIrr3923HcDIrRGcSsNMVz3Uy6XF4alXba8Fm87RpGPiEGsBcB9XrM-HRyryy6iJfTW8NAoVm7Ai8OiLxykM8XaW8PP-CkAeCA")
                .append("UymagOz8OdxaHAULvlTuDAB8ouKrHa8PNAAUvIxqUwRiU2EdVDqAKG90AvKu_Q5HZTMH6vE-Qma_T4nntmSC5aNhajipthUhtm0l")
                .append("CtXmvgRMB32PXV_-CTKtX7IyUEADQD4gUBpDACJdDS4KUnm8lPiBBATp3TelvbC8uOnz2vL-EW4Rj_v4Z_r4QqlJB4BZezBy03IU")
                .append("xgPcZga_hEJ-98DmhgxA3TtScAGUSl2QaSIt_0m5HR5PAnUjK6MbNAAUniZRNgIVgQJpfa2ualoiQZbBkA_pA2XtRWkYfoG0wrws")
                .append("nCjXUIp21MP9sjLI6s6i6BQ18JN2kgm1CAQqTd-Va4PMY2X1QCppe0AXU4c_CdtV7QnTr3WBkuTKzT0J6fSveliGIOCOHXYUjCh9")
                .append("qIAk5soRsvTmPJReICqzFJsUksi6LARbOtip9kIaLdcnppmb8R_U51a0gAqDkvcF6KIJbvHqW4AqYYqOV4yrtDEM82qUoVoIpUUj")
                .append("yEAm2x5DuWEdSA-Cj7UvfFwnEerLI7IGw8zzPjuGwxICACwm97f-uknWQX7BwKav7BQDgGwxVtsNQkjkAED2pQB4pi7_5jb3kjdU")
                .append("lDWnnwYQc_XkfxrOQjGuBYitbC0x70g5uCi3JZIMm4qC_U0EKTGUvB2uECj_V-7uBwIgoURBovQfIUBQAgBAD5YURJFLigIvyi_p")
                .append("UeNfqHGt2BZf0gKiIKR4MSXy-C0E-w4ABMZEjOOisQQfxd0RcccEIo9aeo0Ks_9SazK5lYkY5_hYnONiKMxN7L8PkOKj_kA4uBGI")
                .append("hIx6xkLrKBoo56ogTLc3A5pCKNw1ye5XoBY3JFOpJF5rfzAchKlUdN8BwPFceGxs3qejmCWDjjFUOq0uHUPrpVdiSd4gVNM1Gk8L")
                .append("ja3kXDguO5ciFi6ZSvj94fXJae8SXnO89vsOgOUVbyL2VdTPxZIemqak2nmH3exkaIqhKAqfjyOVgKvsX8VeXJsva1HclzIlCEIy")
                .append("JSSRpl0fm_LO3bs35nnwQ78_lAjuvwkIT_0VhokXo4zJvozZK6CnbW2pTditrJU16VmGRtpA7pQNCS08KCjoxxqAT6Y47F8FQpHg")
                .append("FJJ8zPzBgdnlxaExpP5vw30HgEy3hdl7dCQZCywZjAyXSPIBu81qZQ06M1IDBjkxAyHYuwIAB0v8ofrCWpgUBAyAyEYoHBwfn_c9")
                .append("uNvvXxyZwswXSi2hQpga3wH17gYDozNYAKVjke43IBgzhLJtAjQTkHfMB9LtqEESWYE4RIogiWz-4oInEZt_T_OoNdJII4000kgj")
                .append("jTTSSCONNNJII4000kgjjTTSSCONNNJII4000kijHen_AYqt7o0OnLc3AAAAAElFTkSuQmC");
    }

}
