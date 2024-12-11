package hutechfoss.vrelief.admin.domain;

import static hutechfoss.vrelief.admin.domain.AssertUtils.zonedDataTimeSameInstant;
import static org.assertj.core.api.Assertions.assertThat;

public class PhieuDieuPhoiAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPhieuDieuPhoiAllPropertiesEquals(PhieuDieuPhoi expected, PhieuDieuPhoi actual) {
        assertPhieuDieuPhoiAutoGeneratedPropertiesEquals(expected, actual);
        assertPhieuDieuPhoiAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPhieuDieuPhoiAllUpdatablePropertiesEquals(PhieuDieuPhoi expected, PhieuDieuPhoi actual) {
        assertPhieuDieuPhoiUpdatableFieldsEquals(expected, actual);
        assertPhieuDieuPhoiUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPhieuDieuPhoiAutoGeneratedPropertiesEquals(PhieuDieuPhoi expected, PhieuDieuPhoi actual) {
        assertThat(expected)
            .as("Verify PhieuDieuPhoi auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPhieuDieuPhoiUpdatableFieldsEquals(PhieuDieuPhoi expected, PhieuDieuPhoi actual) {
        assertThat(expected)
            .as("Verify PhieuDieuPhoi relevant properties")
            .satisfies(e -> assertThat(e.getNhaCungCapId()).as("check nhaCungCapId").isEqualTo(actual.getNhaCungCapId()))
            .satisfies(e -> assertThat(e.getNguoiNhanId()).as("check nguoiNhanId").isEqualTo(actual.getNguoiNhanId()))
            .satisfies(e -> assertThat(e.getTinhNguyenVienId()).as("check tinhNguyenVienId").isEqualTo(actual.getTinhNguyenVienId()))
            .satisfies(e -> assertThat(e.getTrangThaiId()).as("check trangThaiId").isEqualTo(actual.getTrangThaiId()))
            .satisfies(e ->
                assertThat(e.getThoiGianDen())
                    .as("check thoiGianDen")
                    .usingComparator(zonedDataTimeSameInstant)
                    .isEqualTo(actual.getThoiGianDen())
            )
            .satisfies(e ->
                assertThat(e.getThoiGianCho())
                    .as("check thoiGianCho")
                    .usingComparator(zonedDataTimeSameInstant)
                    .isEqualTo(actual.getThoiGianCho())
            )
            .satisfies(e ->
                assertThat(e.getCreatedAt())
                    .as("check createdAt")
                    .usingComparator(zonedDataTimeSameInstant)
                    .isEqualTo(actual.getCreatedAt())
            )
            .satisfies(e ->
                assertThat(e.getUpdatedAt())
                    .as("check updatedAt")
                    .usingComparator(zonedDataTimeSameInstant)
                    .isEqualTo(actual.getUpdatedAt())
            );
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPhieuDieuPhoiUpdatableRelationshipsEquals(PhieuDieuPhoi expected, PhieuDieuPhoi actual) {
        // empty method
    }
}